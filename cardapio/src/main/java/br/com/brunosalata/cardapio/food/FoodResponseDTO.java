package br.com.brunosalata.cardapio.food;

/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */
public record FoodResponseDTO(Long id, String title, String image, Integer price) {
    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
