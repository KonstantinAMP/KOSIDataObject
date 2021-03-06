package org.kosi.utils;

import java.util.concurrent.Callable;

public interface TxUtils
{
    /**
     * execute call() within current transaction, throw an exception if none exists.
     *
     * @param callable
     * @throws Exception
     */
    <T> T doInTransactionMandatory(Callable<T> callable) throws Exception;

    /**
     * Execute call() non-transactionally, throw an exception if a transaction exists.
     *
     * @param callable
     * @throws Exception
     */
    <T> T doInTransactionNever(Callable<T> callable) throws Exception;

    /**
     * Execute call() non-transactionally, suspend the current transaction if one exists.
     *
     * @param callable
     * @throws Exception
     */
    <T> T doInTransactionNotSupported(Callable<T> callable) throws Exception;

    /**
     * Execute call() within current transaction, create a new one if none exists.
     *
     * @param callable
     * @throws Exception
     */
    <T> T doInTransactionRequired(Callable<T> callable) throws Exception;

    /**
     * Execute call() within new transaction, and suspend the current transaction if one exists.
     *
     * @param callable
     * @throws Exception
     */
    <T> T doInTransactionRequiresNew(Callable<T> callable) throws Exception;

    /**
     * Execute call() within current transaction, execute non-transactionally if none exists.
     *
     * @param callable
     * @throws Exception
     */
    <T> T doInTransactionSupports(Callable<T> callable) throws Exception;

}
