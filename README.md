# 🚀 Certsys Financial Hub - Modernização de Legado

<p align="center">
  <img src="https://img.shields.io/badge/Java_17-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java 17"/>
  <img src="https://img.shields.io/badge/Spring_Boot_3-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring Boot 3"/>
  <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" alt="Docker"/>
  <img src="https://img.shields.io/badge/Kubernetes-326CE5?style=for-the-badge&logo=kubernetes&logoColor=white" alt="Kubernetes"/>
</p>

## 🎯 Objetivo do Projeto
Este projeto foi desenvolvido como uma **PoC (Proof of Concept) (Prova de Conceito)** focada na migração de sistemas financeiros monolíticos legados para uma arquitetura moderna de microsserviços. 

O sistema atua como o **destino moderno** de uma Engenharia Reversa aplicada sobre rotinas antigas escritas em linguagem **MUMPS** e persistência **CACHÉ**, trazendo a regra de negócios para o estado da arte corporativo.

## 🏗️ Arquitetura e Padrões Aplicados
O desenvolvimento seguiu rigorosamente os princípios ágeis e padrões de mercado:
* **Arquitetura em Camadas:** Padrão **MVC (Model-View-Controller)**, isolando responsabilidades entre `TransactionController`, `TransactionService` e `TransactionRepository`.
* **Qualidade e Agilidade:** Construído com **TDD (Test-Driven Development)** usando JUnit 5 (ciclo Red-Green-Refactor).
* **Persistência e Segurança:** Banco de Dados relacional H2 embutido, com **Consultas SQL Nativas** e **Controle Transacional CMT** via anotação `@Transactional` para garantir a integridade financeira (Rollback em caso de falhas).
* **DEVOPS e Nuvem:** Empacotamento via **Apache Maven**, conteinerização com **Docker** (imagem Linux Alpine) e orquestração de réplicas para alta disponibilidade via **K8S (Kubernetes)**.

## 🗃️ Estrutura do Repositório
- `src/main/java`: API REST moderna em Spring Boot 3.
- `legacy_system/transferencia.m`: Simulação da Engenharia Reversa de uma rotina legada em linguagem MUMPS.
- `src/main/webapp/WEB-INF`: Estrutura base comprovando suporte a migração de telas legadas JSF (JavaServer Faces).
- `Dockerfile` e `k8s-deployment.yaml`: Infraestrutura como código.

## ⚙️ Como Executar o Projeto

**1. Compilar o pacote corporativo (.jar)**
```bash
mvn clean package -DskipTests
```

---

**2. Validar as Regras de Negócio (TDD)**
```bash
mvn test
```

---

**3. Subir no Docker (Modo Contêiner Único)**
```bash
docker build -t certsys-financial-hub .
docker run -p 8080:8080 --name certsys-api certsys-financial-hub
```

---

**4. Subir no Kubernetes (Alta Disponibilidade)**
```bash
docker build -t certsys-financial-hub .
docker run -p 8080:8080 --name certsys-api certsys-financial-hub
```

---

## 💸 Testando a API na Prática

Abra um terminal e simule uma transferência financeira via cURL:

```bash
docker build -t certsys-financial-hub .
docker run -p 8080:8080 --name certsys-api certsys-financial-hub
```
---

Desenvolvido com ☕ e persistência por DavidABx
