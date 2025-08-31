# Kotlin Multiplataforma + Compose Multiplataforma - Projeto The Movie DB

Este projeto foi desenvolvido como parte do curso **"Kotlin Multiplataforma (KMP) e Compose Multiplataforma (CMP) na prática"**. O objetivo é criar um aplicativo móvel nativo para Android e iOS usando Kotlin Multiplataforma e Compose Multiplataforma, compartilhando 100% do código da lógica e UI.

***

## Sobre o Projeto

Aplicativo multiplataforma que consome a API pública **The Movie DB** para exibir:

- Filmes em destaque e lançamentos  
- Detalhes de filmes (poster, descrição, avaliação, elenco e gênero)

***

## O que você vai encontrar neste projeto?

- Configuração do ambiente Kotlin Multiplataforma com Gradle KTS  
- Estruturação do projeto usando arquitetura MVVM + Repository Pattern  
- Injeção de dependência com **Koin**  
- Requisições HTTP e consumo de API com **Ktor**  
- Utilização de coroutines, chamadas assíncronas e Flow para arquitetura reativa  
- Interface de usuário criada com **Compose Multiplataforma (Material 3 e temas customizados)**  
- Código multiplataforma compartilhado para Android e iOS, utilizando APIs expect/actual para funcionalidades nativas

***

## Tecnologias e ferramentas utilizadas

- Kotlin Multiplataforma (KMP)  
- Compose Multiplataforma (CMP)  
- Jetpack Compose (Android UI)  
- Ktor (HTTP client)  
- Coroutines e Flow  
- Koin (Dependency Injection)  
- Gradle Kotlin Script (KTS)  
- The Movie DB API

***

## Requisitos para rodar o projeto

- Conhecimentos básicos de Kotlin e Jetpack Compose  
- Android Studio instalado (Windows ou Mac)  
- (Opcional) MacOS para testar a versão iOS  
- Acesso à internet para chamadas API

***

## Como rodar

1. Clone o repositório  
2. Abra no Android Studio  
3. Conecte um dispositivo ou emulador Android / iOS  
4. Rode o app na plataforma desejada

***

## Estrutura do projeto

- **shared**: Código Kotlin multiplataforma, ViewModels, networking, repositórios  
- **androidApp**: Código específico Android, ponto de entrada e UI Android  
- **iosApp**: Código específico iOS, UI iOS com Compose Multiplataforma  

***

## O que aprendi com este projeto

- Como configurar um projeto KMP com Gradle KTS  
- Construir aplicativos multiplataforma compartilhando UI e lógica de negócio  
- Integração avançada com APIs externas usando Ktor e coroutines  
- Aplicação de padrões de arquitetura modernos (MVVM + Repository)  
- Desenvolvimento de UI multiplataforma com Compose Multiplataforma e Material 3  
- Gerenciamento de dependências com Koin  
- Desenvolvimento real com APIs expect/actual para recursos nativos
