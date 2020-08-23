package hibernate.menu;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "menu")
public class Menu {

	@Id
	@Column(name = "id")
	private String id;

	@OneToMany(mappedBy = "menu", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Plato> platos;

	public Menu() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public List<Plato> getPlatos(){
		return platos;
		
	}
	
	public void setPlatos(List<Plato> platos) {
		this.platos = platos;
	}


	public String toString() {
		return "Menu: "+ platos;
	}

}
