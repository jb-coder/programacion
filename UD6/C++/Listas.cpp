#include<iostream>
#include<conio.h>
#include<stdlib.h>


using namespace std;

//Creamos la estructura del nodo
struct Nodo{
	int dato;
	Nodo *siguiente;
};

//Prototipos de funciones
void menu();
void insertarLista(Nodo*&,int);
void mostrarLista(Nodo *);
void buscarLista(Nodo *,int);
void eliminarNodo(Nodo *&,int);

//Variable global
Nodo *lista=NULL;

int main(){
	
	//Llamada a la función menu
	menu();
	getch();
	return 0;

}

//Función que contiene todas las opciones para ejecutar
//dentro de esta todas las demas funciones
void menu(){
	int opcion,dato;
	
	do{
		cout<<"\t__MENU__\n";
		cout<<"1. Insertar elementos a la lista\n";
		cout<<"2. Mostrar elementos de la lista\n";
		cout<<"3. Buscar un elemento en la lista\n";
		cout<<"4. Eliminar un Nodo de la lista\n";
		cout<<"5. Salir\n";
		cout<<"Opcion: ";
		cin>>opcion;
		
		switch(opcion){
			case 1: cout<<"\nIntroduzca un numero: ";
					cin>>dato;
					insertarLista(lista,dato);
					cout<<"\n";
					system("pause");
					break;
			case 2: mostrarLista(lista);
					cout<<"\n";
					system("pause");
					break;
			case 3: cout<<"\nQue numero desea buscar?: ";
					cin>>dato;
					buscarLista(lista,dato);
					cout<<"\n";
					system("pause");
					break;
			case 4: cout<<"\nQue numero desea eliminar?: ";
					cin>>dato;
					eliminarNodo(lista,dato);
					cout<<"\n";
					system("pause");
					break;
		
		}
		system("cls");
	}while(opcion !=5);
}

//Función para mostrar un elemento de la lista
void mostrarLista(Nodo *lista){
	Nodo *actual = new Nodo();
	actual=lista;
	
	while(actual !=NULL){
		cout<<actual->dato<<" -> ";
		actual=actual->siguiente;
	}
}

//Función para eliminar elementos de la lista
void eliminarNodo(Nodo *&lista, int n){
	if(lista !=NULL){
		Nodo *aux_borrar;
		Nodo *anterior=NULL;
		aux_borrar= lista;
		
		while((aux_borrar != NULL) && (aux_borrar->dato != n)){
			anterior = aux_borrar;
			aux_borrar = aux_borrar->siguiente;
		}
		
		if(aux_borrar == NULL){
			cout<<"El elemento no existe";
		} else if (anterior ==NULL){
			lista=lista->siguiente;
			delete aux_borrar;
		} else {
			anterior->siguiente = aux_borrar->siguiente;
			delete aux_borrar;
		}
	}
}

//Función para buscar un elemento de la lista
void buscarLista(Nodo *lista, int n){
	bool band = false;
	Nodo *actual = new Nodo();
	actual = lista;
	
	while((actual != NULL) && (actual->dato <=n)){
		if(actual->dato ==n){
			band = true;
		}
		actual = actual->siguiente;
	}
	
	if(band==true){
		cout<<"El elemento "<<n<<" si se encuentra en la lista\n";
	}else{
		cout<<"El elemento "<<n<<" no se encuentra en la lista\n";
	}
}

//Función para insertar elementos en la lista
void insertarLista(Nodo*&lista,int n){
	Nodo *nuevo_nodo = new Nodo();
	nuevo_nodo->dato=n;
	
	Nodo *aux1=lista;
	Nodo *aux2;
	
	while((aux1 !=NULL) && (aux1->dato<n)){
		aux2=aux1;
		aux1=aux1->siguiente;
	}
	if(lista==aux1){
		lista = nuevo_nodo;
	} else{
		aux2->siguiente=nuevo_nodo;
	}
	
	nuevo_nodo->siguiente=aux1;
	cout<<"\nElemento "<<n<<" agregado a la lista";
}
