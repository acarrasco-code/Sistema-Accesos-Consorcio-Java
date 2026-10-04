# Sistema de Control de Accesos - Consorcio

Simulador de seguridad y logística para un complejo de departamentos, desarrollado en Java. Este proyecto fue creado para consolidar y aplicar conceptos fundamentales de Programación Orientada a Objetos (POO)
en escenarios de reglas de negocio reales.

## Módulos Desarrollados
* **Control de Visitantes:** Registro de ingresos y egresos de particulares.
* **Gestión de Proveedores:** Lógica diferenciada para técnicos de mantenimiento (acceso a unidades) y servicios de mensajería rápida (recepción en garita).
* **Recepción de Paquetes:** Control de estado de entregas (compras online y correspondencia tradicional).

## Conceptos Técnicos Aplicados
* Sobrecarga de constructores para adaptar la instanciación según el tipo de visitante.
* Encapsulamiento estricto (eliminación de setters) para proteger datos sensibles.
* Manejo de estado seguro mediante métodos de comportamiento (transiciones booleanas).
* Implementación de variables estáticas para contadores y métricas globales del sistema.
