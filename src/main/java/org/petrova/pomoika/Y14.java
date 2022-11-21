package org.petrova.pomoika;

import org.petrova.common.Utils;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Y14 {
    public static void main(String[] args) {

        // Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.

        try {

            Scanner in = new Scanner(System.in);
            Utils.log("Введите число: ");
            int number = in.nextInt();
            Utils.log("" + number);

            a1(number);

        } catch (InputMismatchException e) {
            Utils.log("Указатель не может указывать на null1!");
            Utils.log(" Ошибка: " + e);
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            Utils.log("Указатель не может указывать на null2!");
            Utils.log(" Ошибка: " + e);
            e.printStackTrace();
        } catch (IllegalStateException e) {
            Utils.log("Указатель не может указывать на null3!");
            Utils.log(" Ошибка: " + e);
            e.printStackTrace();
        } catch (IOException e) {
            Utils.log("Ошибка не критична");
        }
        catch (NastyaError error) {
            Utils.log("Ошибка критична: "+ error.getMessage());
            System.exit(0);

        }
        finally {
            Utils.log("Мы попали в блок finally");
        }

        Utils.log("Успешное завершение программы");
    }


    public static void a1(int number) throws IOException {

        if (number == 10) throw new NullPointerException();
        if (number == 20) throw new IOException();
        if (number == 50) throw new NastyaError("50 слишком много");

    }

    static class NastyaError extends Error {

        public NastyaError() {

        }

        public NastyaError(String message) {
            super(message);
        }
    }
}
