public class TestAuthor {
    public static void main(String[] args){
        Author author = new Author("Lev Tolstoy", "levthebest@mail.ru", 'M');
        System.out.println(author);
        author.setEmail("lev_tolsotoy@mail.ru");
        System.out.println(author);
    }
}
