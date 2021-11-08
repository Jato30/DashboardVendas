
import './styles.css';

const TableRows: JSX.Element[] = [];

for (let i=0; i < 50; i++){
    TableRows.push(
        <tr key={i}>
            <td>22/04/2021</td>
            <td>Barry Allen</td>
            <td>34</td>
            <td>25</td>
            <td>15017.00</td>
        </tr>
    );
}

const DataTable = () => {
    return (
        <div className="table-responsive table-sellings">
            <table className="table table-striped table-sm">
                <thead>
                    <tr>
                        <th>Data</th>
                        <th>Vendedor</th>
                        <th>Clientes visitados</th>
                        <th>Negócios fechados</th>
                        <th>Valor</th>
                    </tr>
                </thead>
                <tbody>
                    { TableRows }
                </tbody>
            </table>
        </div>
    );
}

export default DataTable;
