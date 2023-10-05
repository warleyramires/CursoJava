Em um banco, para se cadastrar uma conta bancaria, é necessário
informar o número da conta, o nome do titular da conta, e o valor de
deposito inicial que o titular depositou ao abrir a conta. Este valor
de deposito inicial, entretanto é opcional, ou seja: se o titular não 
tiver dinheiro a depositar no nomento de abrir sua conta, o deposito
inicial não será feito e o saldo inicial da conta será, naturalmente
zero.

Importante: uma vez que a conta bancária foi aberta, o número da conta
nunca poderá ser alterado. Já o nome do titular pode ser alterado(
pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo.
)

Por fim, o saldo da conta não pode ser alterado livremente. É preciso
haver um mecanismo para proteger isso. O saldo só aumenta por meio de
depositos, e só diminui por meio de saques. Para cada saque realizado,
o banco deve cobrar uma taxa de $ 5.00. Nota: a conta pode ficar com
saldo negativo se o saldo não for suficiente para realizar o saque e/ou
pagar a taxa.

Você deve fazer um programa que realize o cadastro de uma conta, dando
opção para que seja ou não informado o valor de depósito inicial. Em 
seguida, realizar um depósito e depois um saque, sempre mostrando os 
dados da conta após cada operação.

---------------------------------------------------------------------
Casos de teste:

Enter account number: 8532
Enter account holder: Alex Green
Is there na initial deposit (y/n)? y
Enter initial deposit value: 500.00

Account data:
Account 8532, Holder: Alex Green, Balance: $ 500.00

Enter a deposit value: 200.00
Updated account data:
Account 8532, Holder: Alex Green, Balance: $ 700.00

Enter a withdraw value: 300.00
Updated account data:
Account 8532, Holder: Alex Green, Balance: $ 395.00
