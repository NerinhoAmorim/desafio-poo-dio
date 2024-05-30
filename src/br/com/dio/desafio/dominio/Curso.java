package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;
    	private String professor;


    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
    @Override
	public Map<String, Object> getInfo() {
		Map<String, Object> info = new HashMap<>();
		info.put("descricao", getDescricao());
		info.put("cargaHoraria", cargaHoraria);
		info.put("professor", professor);
		return info;
	}
}
