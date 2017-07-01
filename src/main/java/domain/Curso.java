package domain;

import javax.persistence.*;
import java.util.List;
import java.util.Vector;

@Entity
public class Curso implements BaseEntity<Long> {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String codigo;
	private String nombre;
	private Integer creditos;

	@ManyToMany
	@JoinTable (
			name = "cursoPrerrequisitos",
			joinColumns = @JoinColumn(name="CursoId", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name="PrerrequisitoId", referencedColumnName = "id")
	)
	private List<Curso> prerrequisitos;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	public List<Curso> getPrerequisitos() {
		return prerrequisitos;
	}

	public void setPrerequisitos(List<Curso> prerrequisitos) {
		this.prerrequisitos = prerrequisitos;
	}

	public Curso() {
		prerrequisitos = new Vector<Curso>();
	}

	public Curso(String codigo, String nombre, Integer creditos) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.creditos = creditos;
		this.prerrequisitos = new Vector<Curso>();
	}
}
