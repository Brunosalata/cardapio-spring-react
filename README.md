# Cardápio Digital - Back-end e Front-end

<h2>🛠️ Tecnologias Utilizadas</h2>
<h3>Backend (Java + Spring Boot)</h3>
<ul>
    <li><strong>Spring Boot</strong> - Estrutura do servidor</li>
    <li><strong>Spring MVC</strong> - Criação das rotas RESTful</li>
    <li><strong>Spring Data JPA</strong> - Manipulação e persistência de dados</li>
    <li><strong>Lombok</strong> - Redução de código boilerplate</li>
    <li><strong>Postgres Driver</strong> - Conexão com banco de dados PostgreSQL</li>
</ul>

<h3>Frontend (React.js)</h3>
<ul>
    <li><strong>React.js</strong> - Interface interativa e responsiva</li>
    <li><strong>Axios</strong> - Consumo de APIs RESTful</li>
    <li><strong>CSS</strong> - Estilização moderna e eficiente</li>
</ul>

<h3>Banco de Dados</h3>
<ul>
    <li><strong>PostgreSQL</strong> - Armazena os dados do cardápio e pedidos</li>
</ul>

<h2>🍽️ Recursos Principais</h2>
<ul>
    <li>✅ Cadastro de pratos</li>
    <li>✅ Visualização dinâmica do cardápio</li>
    <li>✅ Integração via API RESTful</li>
    <li>✅ Layout responsivo e intuitivo</li>
</ul>

<h2>🔄 Como Executar o Projeto</h2>

<h3>1. Clonar o Repositório</h3>
<pre><code>git clone https://github.com/Brunosalata/cardapio-spring-react.git
<br>cd cardapio</code></pre>

<h3>2. Configurar o Backend (Spring Boot)</h3>
<p>Configure o PostgreSQL no <code>application.properties</code>:</p>
<pre><code>spring.datasource.url=jdbc:postgresql://localhost:5432/cardapio
<br>spring.datasource.username=seu_usuario
<br>spring.datasource.password=sua_senha</code></pre>

Execute o backend:
<pre><code>mvn spring-boot:run</code></pre>

<h3>3. Configurar o Frontend (React.js)</h3>
<pre><code>cd cardapio-front
<br>npm install
<br>npm start</code></pre>

O projeto estará rodando em http://localhost:3000! 🚀

<h2>📊 Modelagem do Banco de Dados</h2>
<p>A estrutura principal do banco de dados PostgreSQL inclui:</p>
<ul>
    <li><strong>foods</strong> (id TEXT, title TEXT, imagem TEXT, price INT)</li>
</ul>

<h2>👨‍💻 Contribuição</h2>
<p>Esse projeto foi desenvolvido para <strong>fins didáticos</strong>, com foco nas ferramentas e clean code, abordando as melhores práticas de desenvolvimento moderno.</p>
<p>Contribuições são bem-vindas! Sinta-se à vontade para abrir <strong>issues</strong> ou enviar <strong>pull requests</strong>. 💚</p>

<h2>📱 Contato</h2>

**Email:** [brunosalata.dev@gmail.com](mailto:brunosalata.dev@gmail.com)

**LinkedIn:** [brunosalatalima](https://www.linkedin.com/in/brunosalatalima/)

**GitHub:** [Brunosalata](https://github.com/Brunosalata)

