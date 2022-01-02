public class AlignRight  implements AlignStrategy{

    @Override
    public void render(String paragraph) {
        System.out.printf("%s##\n",paragraph);
    }
}