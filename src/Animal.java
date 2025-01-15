
class Animal {
    private static int animalCount = 0;

    public Animal() {
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void run(int distance) {
        System.out.println("The animal has run " + distance + " ì.");
    }

    public void swim(int distance) {
        System.out.println("The animal has swum " + distance + " ì.");
    }
}

class Cat extends Animal {
    private static int catCount = 0;
    private boolean isHungry = true;

    public Cat() {
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("The cat has run " + distance + " ì.");
        } else {
            System.out.println("The cat can't run " + distance + " ì.");
        }
    }

    public void swim(int distance) {
        System.out.println("The cat can't swim.");
    }

    public boolean eatFromBowl(FoodBowl bowl) {
        if (isHungry && bowl.getFoodAmount() > 0) {
            isHungry = false;
            bowl.decreaseFood(1);
            return true;
        }
        return false;
    }

    public boolean isHungry() {
        return isHungry;
    }
}

class Dog extends Animal {
    private static int dogCount = 0;

    public Dog() {
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("The dog has run " + distance + " ì.");
        } else {
            System.out.println("The dog can't run " + distance + " ì.");
        }
    }

    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("The dog has swum " + distance + " ì.");
        } else {
            System.out.println("The dog can't swim " + distance + " ì.");
        }
    }
}

class FoodBowl {
    private int foodAmount;

    public FoodBowl(int initialFood) {
        this.foodAmount = Math.max(initialFood, 0);
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void decreaseFood(int amount) {
        foodAmount = Math.max(foodAmount - amount, 0);
    }

    public void addFood(int amount) {
        foodAmount += amount;
    }
}