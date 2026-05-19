package Main.Java.br.com.secao12.Em_aula_exercicio2_133.Entities;

public class Comment {

    private String text;

    public Comment(){

    }

    public Comment(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
