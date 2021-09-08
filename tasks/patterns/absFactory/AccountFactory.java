package org.training.tasks.patterns.absFactory;

public interface AccountFactory {
    Credit createCredit();
    Deposit createDeposit();
}
