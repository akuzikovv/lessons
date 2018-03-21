package Lesson15_Tamagochi;

public class Tamagochi implements Runnable {

    private static final int MAX_VALUE = 100;
    private static final int NORMAL_VALUE = 50;
    private int errorsCounter = 0;
    private int eatLevel = MAX_VALUE;
    private int playLevel = MAX_VALUE;
    private int toiletLevel = MAX_VALUE;
    private int sleepLevel = MAX_VALUE;

    private int eatLevelStep = 40;
    private int playLevelStep = 20;
    private int toiletLevelStep = 30;
    private int sleepLevelStep = 40;


    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
//        int sleepCount = 10;
        while (!rip()) {
            decreaseParameters();
            try {
                decreaseParameters();
                showProblems();
                for (int i = 0; i<10; i++){


//                if (!Thread.interrupted() && sleepCount > 1) {
                    Thread.sleep(1000);
                    if (errorsCounter>=5){
                        break;
                    }
//                    sleepCount--;
                }
            } catch (InterruptedException e) {
//                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("R.I.P");

    }

    private void showProblems() {
        if (playLevel <= NORMAL_VALUE) {
            System.out.println("I want to play with you");
        }
        if (eatLevel <= NORMAL_VALUE) {
            System.out.println("Please feed me");
        }
        if (sleepLevel <= NORMAL_VALUE) {
            System.out.println("zZzzZzzZZZZZZZZzzz");
        }
        if (toiletLevel <= NORMAL_VALUE) {
            System.out.println("Where is the toilet?");
        }
    }

    public void play() {
        if (playLevel <= NORMAL_VALUE) {
            playLevel = MAX_VALUE;
        } else {
            errorsCounter++;
        }
    }

    public void feed() {
        if (eatLevel <= NORMAL_VALUE) {
            eatLevel = MAX_VALUE;
        } else {
            errorsCounter++;
        }
    }

    public void clear() {
        if (toiletLevel <= NORMAL_VALUE) {
            toiletLevel = MAX_VALUE;
        } else {
            errorsCounter++;
        }
    }

    public void getSleep() {
        if (playLevel <= NORMAL_VALUE) {
            sleepLevel = MAX_VALUE;
        } else {
            errorsCounter++;
        }
    }

    private boolean rip() {
        return (sleepLevel <= 0 || toiletLevel <= 0 || eatLevel <= 0 || playLevel <= 0 || errorsCounter >= 5);
    }

    private void decreaseParameters() {
        playLevel -= playLevelStep;
        eatLevel -= eatLevelStep;
        toiletLevel -= toiletLevelStep;
        sleepLevel -= sleepLevelStep;
    }

}
