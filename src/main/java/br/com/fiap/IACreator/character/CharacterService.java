package br.com.fiap.IACreator.character;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CharacterService {
    
    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository){
        this.characterRepository = characterRepository;
    }

    public List<Character> getAllCharacters(){
        return characterRepository.findAll();
    }

    public Character save(Character character){
        return characterRepository.save(character);
    }
}
