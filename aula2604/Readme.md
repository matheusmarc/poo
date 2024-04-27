# Diagrama de classes UML

 ```mermaid
 classDiagram
     class App{
         - Agenda: agenda
         + main()
         + menu()
     }
     
    class Agenda{
        -contatos: ArrayList<Contato>
        +Agenda()
        +addContato(c:Contato) boolean
        +removeContato(n: String, s: String) boolean
        +addTelefone(r: String, n: String, c: Contato) boolean
        
    }
    
    class Contato{
        +addEmail(r: String, e:String) boolean
        +removeTelefone(r: String) boolean
    }
    
    class Telefone{
        
    }
    
    class Email{
        
    }
    
    Contato *-- Telefone

    Contato *-- Email
    
```