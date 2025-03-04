class Bank {
    float calculateInterest(float principal, int time) {
        return 0;
    }
}

class SBI extends Bank {
    private static final float INTEREST_RATE = 10.8f;

    @Override
    float calculateInterest(float principal, int time) {
        return (principal * INTEREST_RATE * time) / 100;
    }
}

class ICICI extends Bank {
    private static final float INTEREST_RATE = 11.6f;

    @Override
    float calculateInterest(float principal, int time) {
        return (principal * INTEREST_RATE * time) / 100;
    }
}

class AXIS extends Bank {
    private static final float INTEREST_RATE = 12.3f;

    @Override
    float calculateInterest(float principal, int time) {
        return (principal * INTEREST_RATE * time) / 100;
    }
}

public class TestOverriding {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide principal and time as command line arguments.");
            return;
        }

        float principal = Float.parseFloat(args[0]);
        int time = Integer.parseInt(args[1]);

        Bank sbiBank = new SBI();
        Bank iciciBank = new ICICI();
        Bank axisBank = new AXIS();

        System.out.println("SBI rate of interest: " + sbiBank.calculateInterest(principal, time));
        System.out.println("ICICI rate of interest: " + iciciBank.calculateInterest(principal, time));
        System.out.println("AXIS rate of interest: " + axisBank.calculateInterest(principal, time));
    }
}
