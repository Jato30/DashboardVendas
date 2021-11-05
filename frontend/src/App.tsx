
import { NavBar, Footer, DataTable } from './components';

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary">Olá Mundo!</h1>
        <DataTable></DataTable>
      </div>
      <Footer />
    </>
  );
}

export default App;
