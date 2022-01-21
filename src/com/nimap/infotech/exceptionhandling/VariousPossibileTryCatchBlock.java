package com.nimap.infotech.exceptionhandling;

public class VariousPossibileTryCatchBlock {

	public static void main(String[] args) {
		/*
		 * //condtion-1 try { System.out.println("Hello"); } catch (Exception e) {
		 * System.out.println(e.getMessage()); }
		 */
		
		/*
		 * //condtion 2 try { System.out.println("Hello"); } catch (ArithmeticException
		 * e) { System.out.println(e.getMessage()); } catch (Exception e) {
		 * System.out.println(e.getMessage()); }
		 */
		
		//condtion 3 nreachable catch block for Exception. It is already handled by the catch block for Exception
		
		/*
		 * try { System.out.println("Hello"); } catch (Exception e) {
		 * System.out.println(e.getMessage()); } catch (Exception e) {
		 * System.out.println(e.getMessage()); }
		 */
		//condtion 4
		/*
		 * try {
		 * 
		 * }catch (Exception e) { // TODO: handle exception }finally {
		 * 
		 * }
		 */
		
		//condtion 5
		/*
		 * try {
		 * 
		 * }catch (Exception e) { // TODO: handle exception }try {
		 * 
		 * } catch (Exception e) { // TODO: handle exception }
		 */
		
		//condtion 6 
		/*
		 * try {
		 * 
		 * }finally {
		 * 
		 * }
		 */
		
		//condtion 7  Syntax error on token "catch", ( expected
		
		/*
		 * try {
		 * 
		 * }finally {
		 * 
		 * }catch (Exception e2) { // TODO: handle exception }
		 */
		
		//condtion 8 Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		
		/*
		 * try {
		 * 
		 * }try {
		 * 
		 * }catch (Exception e) { // TODO: handle exception }finally {
		 * 
		 * }
		 */
		
		//condtion 9 Syntax error on token "finally", delete this token
		/*
		 * try {
		 * 
		 * }catch (Exception e) { // TODO: handle exception }finally {
		 * 
		 * }finally {
		 * 
		 * }
		 */
	}

}
