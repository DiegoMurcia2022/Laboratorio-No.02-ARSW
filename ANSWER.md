# LABORATORIO No.02 - ARSW

```
Integrantes:
    Diego Alejandro Murcia Cespedes
```

## PARTE I
1. Al ejecutar el programa y abrir el administrador de procesos se puede ver que para la ejecución de
    este programa utiliza todos los núcleos:
   
    ![](/img/Monitor_Proceso.png)

2. El programa fue modificado para que resuelva el problema con 3 hilos en vez de utilizar un solo hilo.


3. Cuando el programa transcurren 5 segundos el programa solicita que se presione la tecla ENTER para continuar:
   
    ![](/img/Press_Enter_to_Continue.png)

## PARTE III
Se identificaron las siguientes regiones críticas:
![](/img/Monitor_Proceso.png)

Estas regiones fueron consideradadas como criticas, ya que si se mira el ganador en un principio
hay más de uno que toma el primer puesto porque están accediendo al mismo tiempo los hilos al verificar
el resultado. Por lo que necesitamos utilizar los mecanismos de sincronización para que esto no suceda.
