#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;

struct Nodo{
	int dato;
	Nodo *siguiente;
};

void agregardatoPila(Nodo *&,int);
void sacarPila(Nodo *&,int &);

int main(){
	Nodo *pila=NULL;
	int dato;
	
	cout<<"Introduzca un numero: ";
	cin>>dato;
	agregardatoPila(pila,dato);
	
	cout<<"Introduzca otro numero: ";
	cin>>dato;
	agregardatoPila(pila,dato);
	
	cout<<"\nSacando elementos de la pila ";
	while(pila != NULL){
		sacarPila(pila,dato);
		if(pila != NULL){
			cout<<dato<<" , ";
		} else {
			cout<<dato<<".";
		}
	}
	
	
	getch();
	return 0;
}

void sacarPila(Nodo *&pila,int &n){
	Nodo *aux = pila;
	n=aux->dato;
	pila = aux->siguiente;
	delete aux;
}
void agregardatoPila(Nodo *&pila,int n){
	Nodo *nuevo_nodo = new Nodo();
	nuevo_nodo->dato = n;
	nuevo_nodo->siguiente=pila;
	pila=nuevo_nodo;
	
	cout<<"El dato "<<n<<" se ha agregado a la pila"<<endl;
}
