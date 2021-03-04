public class Worker { //имя, фамилию, логин, пароль, идентификатор, рейтинг работника, должность работника
    private String firstName,secondName, login, password, ID, rating,post;

        public Worker(String firstName, String secondName, String login, String password, String ID, String rating, String post){
            this.firstName = firstName;
            this.secondName = secondName;
            this.login = login;
            this.password = password;
            this.ID = ID;
            this.rating = rating;
            this.post = post;
        }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }


    public String toString(){
        return "{\"Имя\":\""+firstName+"\",\"Фамилия\":\""+secondName+"\",\"Логин\":\""+login+"\"," +
                "\"Пароль\":\""+password+"\",\"Идентификатор\":\""+ID+"\",\"Рейтинг\":\""+rating+"\",\"Должность\":\""+post+"\"}";
    }
}
