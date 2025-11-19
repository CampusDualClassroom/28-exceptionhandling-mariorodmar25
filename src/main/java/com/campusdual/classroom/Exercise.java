package com.campusdual.classroom;

public class Exercise {
        public static void main(String[] args) {
            try {
                throw new Exception("Esto es una Excepción");
            } catch (Exception e) {
                System.out.println("Excepción controlada: " + e.getMessage());
            }

            System.out.println("Programa finalizado");
        }
    }