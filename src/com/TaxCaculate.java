package com;

public class TaxCaculate implements TaxCaculateInterface {
    @Override
    public float Caculate(float income) {
        float tax = 0;
        float beyond = 0;
        // income less than 3500
        beyond = income - 3500;

        if (beyond <= 0) {
            tax = 0;
        } else if (beyond <= 1500) {
            tax = beyond * 0.03f;
        } else if (beyond <= 4500) {
            tax = beyond * 0.1f - 105;
        } else if (beyond <= 9000) {
            tax = beyond * 0.2f - 555;
        } else if (beyond <= 35000) {
            tax = beyond * 0.25f - 1005;
        } else if (beyond <= 55000) {
            tax = beyond * 0.3f - 2755;
        } else if (beyond <= 80000) {
            tax = beyond * 0.35f - 5505;
        } else {
            tax = beyond * 0.45f - 13505;
        }

        return tax;
    }
}
