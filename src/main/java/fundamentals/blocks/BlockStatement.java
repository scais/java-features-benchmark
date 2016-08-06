package fundamentals.blocks;

public class BlockStatement {

    public void oneBlock() {
        int foo = 0;
        {
            int bar = 1;
            multipleBlocks();
        }
    }

    public void multipleBlocks() {
        int a = 10;
        {
            a = 100;
            {
                a = 1000;
            }
        }
    }

}
