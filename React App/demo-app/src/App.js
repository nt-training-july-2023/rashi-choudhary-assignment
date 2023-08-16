import logo from './logo.svg';

import Registration from './Components/Registration';
import Login from './Components/Login';
import { BrowserRouter, Route, Routes } from 'react-router-dom';



function App() {
  return (

    <div className="App">
     

        <Routes>
          <Route path='/login' element={<Login />}></Route>
        </Routes>
      {/* <Login/> */}
      <Registration />

    </div>
  );
}

export default App;
