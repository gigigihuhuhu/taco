package tacos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tacos.entity.Ingredient;
import tacos.entity.Ingredient.Type;
import tacos.repository.IngredientRepository;

@SpringBootApplication
public class TacoCloudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}
	
	@Autowired
	private IngredientRepository ingredientRepository;

	@Override
	public void run(String... args) throws Exception {
		List<Ingredient> ingredientList = new ArrayList<Ingredient>();
		ingredientList.add(Ingredient.builder().id("FLTO").name("Flour Tortilla").type(Type.WRAP).build());
		ingredientList.add(Ingredient.builder().id("COTO").name("Corn Tortilla").type(Type.WRAP).build());
		ingredientList.add(Ingredient.builder().id("GRBF").name("Ground Beef").type(Type.PROTEIN).build());
		ingredientList.add(Ingredient.builder().id("CARN").name("Carnitas").type(Type.PROTEIN).build());
		ingredientList.add(Ingredient.builder().id("TMTO").name("Diced Tomatoes").type(Type.VEGGIES).build());
		ingredientList.add(Ingredient.builder().id("LETC").name("Lettuce").type(Type.VEGGIES).build());
		ingredientList.add(Ingredient.builder().id("CHED").name("Cheddar").type(Type.CHEESE).build());
		ingredientList.add(Ingredient.builder().id("JACK").name("Monterrey Jack").type(Type.CHEESE).build());
		ingredientList.add(Ingredient.builder().id("SLSA").name("Salsa").type(Type.SAUCE).build());
		ingredientList.add(Ingredient.builder().id("SRCR").name("Sour Cream").type(Type.SAUCE).build());
		
		ingredientRepository.saveAll(ingredientList);
	}

}
