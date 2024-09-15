package utilidades;
// package modelos;

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//     Scanner scann= new Scanner(System.in);

//     int tipoDeUsuario;
//     String nome;
//     // String email;
//     int opcaoEntrada;
//     int opcaoValida;

//         System.out.println("BEM VINDO AO BIBLIOTECH\n");

//             do {
//                 System.out.println("O que você deseja:\n      1 - Cadastrar   2 - Login");
//                 opcaoEntrada= scann.nextInt();
//                         scann.nextLine();
                

//                 if (opcaoEntrada != 1){
//                     System.out.println("Opção não identificada. Digite: 1.");
//                 }
//                 else{
//                     opcaoValida = opcaoEntrada;
//                 }
//               }
//             while (opcaoEntrada != 1); 

// //finalizando a opção. indo para o próximo requisito: NOME.

//              while(true){    
                        
//                     try{
//                         System.out.println ("Digite seu nome:");
//                         nome=scann.nextLine();

//                         ValidacaoNome.validarNome(nome);
//                         System.out.println ("Nome válido!");
//                         break; //while referente ao nome.                   
//                     } catch (InvalidNomeFormatException e){
//                             System.out.println(e.getMessage());
//                     }
//              }
// // dúvida, será que vai quebrar todo o código aqui?
// //partimos agora para cadastrar o usuario

//          if (opcaoValida ==1) {
//                 Cadastrar.cadastrarUsuario(opcaoValida, nome);
//             }          
//         }   
// }

