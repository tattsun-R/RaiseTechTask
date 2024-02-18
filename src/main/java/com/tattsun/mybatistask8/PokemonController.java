package com.tattsun.mybatistask8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PokemonController {

    private final PokemonMapper pokemonMapper;

    public PokemonController(PokemonMapper pokemonMapper) {
        this.pokemonMapper = pokemonMapper;
    }

    @GetMapping("/pokemon_index")
    public List<Pokemon> getAllPokemon() {
        return pokemonMapper.getAllPokemon();
    }

    @GetMapping("/pokemon_index/names")
    public List<Pokemon> getPokemonByNames(@RequestParam String startsWith){
        return pokemonMapper.getPokemonByNameStartingWith(startsWith);
    }

    @GetMapping("/pokemon_index/types")
    public List<Pokemon> getPokemonByType(@RequestParam("type") String type) {
        return pokemonMapper.getPokemonByType(type);
    }
}
