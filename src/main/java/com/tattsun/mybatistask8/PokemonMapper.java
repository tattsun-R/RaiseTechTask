package com.tattsun.mybatistask8;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PokemonMapper {

    @Select("SELECT * FROM pokemon_index")
    List<Pokemon> getAllPokemon();

    // prefixは接頭辞という意味
    @Select("SELECT * FROM pokemon_index WHERE name LIKE CONCAT(#{prefix}, '%')")
    List<Pokemon> getPokemonByNameStartingWith(String prefix);

    @Select("SELECT * FROM pokemon_index WHERE type1 = #{type} OR type2 = #{type}")
    List<Pokemon> getPokemonByType(String type);
}
