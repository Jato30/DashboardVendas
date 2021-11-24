import { Footer, NavBar } from "components"
import { Link } from "react-router-dom";

const Home = () => {
    return (

        <>
            <NavBar />
                <div className="container">
                    <div className="jumbotron">
                        <h1 className="display-4">DB-Vendas</h1>
                        <p className="lead">Analise o desempenho das suas vendas por diferentes perspectivas</p>
                        <hr />
                        <p>Esta aplicação consiste em exibir um dashboard a partir de dados fornecidos por um back end construído com Spring Boot.</p>
                        <Link to="/dashboard" className="btn btn-primary btn-lg">Acessar o Dashboard</Link>
                    </div>
                </div>
            <Footer />

        </>
    );
}

export default Home;