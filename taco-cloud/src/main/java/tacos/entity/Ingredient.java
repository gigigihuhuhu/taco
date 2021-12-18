package tacos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "ingredient")
public class Ingredient {
	@Id
	@Column(name ="id")
	private String id;
	
	@Column(name ="name")
	private String name;
	
	@Column(name ="type")
	private Type type;
	
	public static enum Type {
		 WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE
	}
}
