package assignment04;

class Fruit {
    String name;
    int calories;
    int price;
    String color;

    public Fruit(String name, int calories, int price, String color) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}



class News{
    int newsId;
    String postedByUser;
    String commentedByUser;
    String comment;

    public News(int newsId, String postedByUser, String commentedByUser, String comment) {
        this.newsId = newsId;
        this.postedByUser = postedByUser;
        this.commentedByUser = commentedByUser;
        this.comment = comment;
    }


    public int getNewsId() {
        return newsId;
    }

    public String getPostedByUser() {
        return postedByUser;
    }

    public String getCommentedByUser() {
        return commentedByUser;
    }

    public String getComment() {
        return comment;
    }
}

class Trader{
    String name;
    String city;
}

class Transaction{
    int year;
    int value;
}
