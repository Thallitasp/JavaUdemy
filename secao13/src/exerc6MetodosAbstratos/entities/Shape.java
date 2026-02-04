package secao13.src.exerc6MetodosAbstratos.entities;

import secao13.src.exerc6MetodosAbstratos.entities.enums.Colors;

public abstract class Shape {

    private Colors color;

    public Shape() {
    }

    public Shape(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public abstract double area();
}
