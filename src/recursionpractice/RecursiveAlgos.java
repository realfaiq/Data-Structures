/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionpractice;

/**
 *
 * @author Faiq
 */
public class RecursiveAlgos {
    public int Factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*Factorial(n-1);
        }
        
    }
    
    public int LinearSum(int A[],int n){
        if(n == 1){
            return A[0];
        }
        else{
            return A[n-1] + LinearSum(A,n-1);
        }
    }
    
    public void ReverseList(int RList[], int i, int j){
        
            if(i < j){
            int temp = 0;
            RList[i] = temp;
            RList[i] = RList[j];
            RList[j] = temp;
            i++;
            j--;
            
            ReverseList(RList, i+1 , j-1);
            
        }
        
  
    }
    
    public int EuGCD(int a , int b){
        
        if(b == 0){
            return a;
        }
        else{
            return EuGCD(b, a%b);
        }
        
    }
    
    public int Fibonacci(int F){
        
        if(F<=1){
            return F;
        }
        else{
            return Fibonacci(F-1) + Fibonacci(F-2);
        }
        
    }
    
    public int FibonacciSum(int F){
        
        if(F == 1 || F == 2){
            return 1;
        }
        else{
            return Fibonacci(F-1) + Fibonacci(F-2);
        }
        
    }
    
    public int Triangular(int T){
        if(T == 1){
            return 1;
        }
        else{
            return T + Triangular(T-1);
        }
    }
    
    public int SquarSum(int N){
        
        if(N == 1){
            return 1;
        }
        else{
            return N*N + SquarSum(N-1);
        }
        
    }
    
    public int BinarySum(int A[], int i, int n){
        
        if(n == 1){
            return A[i];
        }
        else{
            return BinarySum(A,i,n/2) + BinarySum(A, i+(n/2), n/2); 
        }
        
    }
    
    
}
