package com.prtk.methodOverriding;
class Bank {
    public void RateofInterest() {
        System.out.println("General ROI is 5%");
    }
}
    class SBI extends Bank {
        @Override
        public void RateofInterest() {
            System.out.println("General ROI is 6%");
        }
    }

    class BOB extends Bank {
        @Override
        public void RateofInterest() {
            System.out.println("General ROI is 6.5%");
        }
    }

    public class Main {
        public static void main(String[] args) {
            SBI obj = new SBI();
            obj.RateofInterest();
            BOB obj2 = new BOB();
            obj2.RateofInterest();
        }
    }
