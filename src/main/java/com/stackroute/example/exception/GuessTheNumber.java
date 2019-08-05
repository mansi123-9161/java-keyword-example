package com.stackroute.example.exception;

public class GuessTheNumber {
        private int x;
        public static void main(String[] args)
        {
           GuessTheNumber us = new GuessTheNumber();
            int guesses[] =
                    {
                            -2, 1, 100, 105, 42
                    };
            System.out.println("Guessing the value of X...");
            for (int i = 0; i < guesses.length; i++)
            {
                System.out.print("Trying: " + guesses[i]);
                try
                {
                    if (us.guessX(guesses[i]))
                    {
                        System.out.println(" - Correct");
                    }
                    else
                    {
                        System.out.println(" - Incorrect");
                    }
                }
                catch (MyException ex)
                {
                    System.out.println();
                    // Note that we just report here, there is no re-throw and program execution continues - there is no crash.
                    System.err.println(ex.getReason());
                    // Here you show a single message to the user as above and log the stack trace for them to send to you.
                    System.err.println("Stack trace...");
                    ex.printStackTrace(System.err);
                }
            }
        }

        /**
         * Set the value to guess.
         */
        public GuessTheNumber()
        {
            x = 42;
        }

        public boolean guessX(int guess) throws MyException
        {
            boolean retr = false;

            if ((guess < 1) || (guess > 100))
            {
                throw new MyException("Guess " + guess + " must be between 1 and 100.");
            }
            else if (guess == x)
            {
                retr = true;
            }
            return retr;
        }
    }
