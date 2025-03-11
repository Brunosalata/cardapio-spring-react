package br.com.brunosalata.cardapio.food;

/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */
public record FoodRequestDTO(
        String title,
        String image,
        Integer price
) {
}
