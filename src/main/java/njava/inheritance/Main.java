package njava.inheritance;

public class Main {
    public static void main(String[] args) {
        FootballPlayer ronaldo = new Ronaldo("ronaldo", 100, 105, 110);
        FootballPlayer messi = new Messi("messi", 90, 100, 110);

        System.out.println(ronaldo);
        System.out.println(messi);


        List<Post> posts = Arrays.asList(new Text(), new Picture());
        List<SNS> sns = Arrays.asList(new FaceBook(), new Twitter());

        posts.forEach(p-> {
            sns.forEach(s -> p.postOn(s));
        });

    }
}
