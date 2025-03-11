package br.com.brunosalata.cardapio.food;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */
public interface FoodRepository extends JpaRepository<Food, String> {
}
