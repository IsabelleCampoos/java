����   = O  exercicios2  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lexercicios2; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   HEntre com um número positivo, um numero negativo encerra a digitação:
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextInt ()I
  , -  close / java/lang/StringBuilder 1 &
A média dos numero digitados é de: 
 . 3  &
 . 5 6 7 append (I)Ljava/lang/StringBuilder; 9 
Foram digitados 
 . ; 6 < -(Ljava/lang/String;)Ljava/lang/StringBuilder; > 
 números.
 . @ A B toString ()Ljava/lang/String; args [Ljava/lang/String; numero I cont soma Ljava/util/Scanner; media StackMapTable D 
SourceFile exercicios2.java !               /     *� �    
                    	           \=>� Y� � :� � !� 
`>�� 'Y<���� +l6� � .Y0� 2� 48� :� 4=� :� ?� !�    
   2      	           "  ,  1  6  [     H    \ C D     E F  ) 3 E F   Z G F   X H F   L  I  6 & J F  K   " �   L   �   L      M    N