import java.util.Random;

class NumberGenerator implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int randomNumber = random.nextInt(10);  
            System.out.println("Generated number: " + randomNumber);

            if (randomNumber % 2 == 0) {
                SquareThread squareThread = new SquareThread(randomNumber);
                new Thread(squareThread).start();
            } else {
                CubeThread cubeThread = new CubeThread(randomNumber);
                new Thread(cubeThread).start();
            }

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SquareThread implements Runnable {
    private int number;

    public SquareThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Square of " + number + ": " + (number * number));
    }
}

class CubeThread implements Runnable {
    private int number;

    public CubeThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Cube of " + number + ": " + (number * number * number));
    }
}

public class MultiThreadApplication {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        new Thread(numberGenerator).start();
    }
}