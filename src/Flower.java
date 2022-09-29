public class Flower {
    private String flowerColor;
    private String country;
    private float cost;
    private int lifeSpan;

    public Flower(String flowerColor, String country, float cost, int lifeSpan) {
        if (flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }

        if (country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }

        if (cost <= 0) {
            this.cost = 1f;
        } else {
            this.cost = cost;
        }

        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public float getCost() {
        return cost;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public void setCost(float cost) {
        if (cost <= 0) {
            this.cost = 1f;
        } else {
            this.cost = cost;
        }
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    @Override
    public String toString() {
        return flowerColor + ", " + country + ", стоимость штуки - " + cost + " рублей, срок стояния - " + lifeSpan + " дней";
    }

}
