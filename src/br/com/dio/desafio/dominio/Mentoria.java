package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;
    private String mentor;


    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    public String getMentor() {
		return mentor;
	}

	public void setMentor(String mentor) {
		this.mentor = mentor;
	}

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
    @Override
	public Map<String, Object> getInfo() {
		Map<String, Object> info = new HashMap<>();
		info.put("descricao", getDescricao());
		info.put("data", data);
		info.put("mentor", mentor);

		return info;
	}
}
