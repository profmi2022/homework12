public enum BodyType {

        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        ROADSTER("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP ("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        @Override
        public String toString() {  //Название типа кузова на русском языке
            return "тип кузова: " + name;
        }

        public String name;

        BodyType(String name) {
            this.name = name;
        }
}
