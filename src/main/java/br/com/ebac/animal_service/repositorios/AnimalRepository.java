package br.com.ebac.animal_service.repositorios;

import br.com.ebac.animal_service.entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//Nosso Repository para fins de manipulação de dados no banco (Controller consumindo)
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    //General animals query
    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada")
    List<Animal> findNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL")
    List<Animal> findAdopted();

    //Dogs query
    @Query("SELECT a FROM Animal a WHERE a.tipo = 'Cachorro'")
    List<Animal> findByDogs();

    @Query("SELECT a FROM Animal a WHERE a.tipo = 'Cachorro' AND a.dataAdocao IS NULL ORDER BY a.dataEntrada")
    List<Animal> findDogsNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.tipo = 'Cachorro' AND a.dataAdocao IS NOT NULL")
    List<Animal> findDogsAdopted();

    //Cats query
    @Query("SELECT a FROM Animal a WHERE a.tipo = 'Gato'")
    List<Animal> findByCats();

    @Query("SELECT a FROM Animal a WHERE a.tipo = 'Gato' AND a.dataAdocao IS NULL ORDER BY a.dataEntrada")
    List<Animal> findCatsNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.tipo = 'Gato' AND a.dataAdocao IS NOT NULL")
    List<Animal> findCatsAdopted();

}
