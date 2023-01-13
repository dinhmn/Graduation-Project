import { Route, Routes } from 'react-router-dom';
import Nav from './common/Nav';
import NavAddress from './common/NavAddress';
import HomePage from './user/view/HomePage';

function App() {
  return (
    <div>
      <NavAddress className="bg-opacity-60 bg-slate-700 text-br"></NavAddress>
      <Nav></Nav>
      <Routes>
        <Route path="/">
          <Route path="/home" element={<HomePage></HomePage>}></Route>
          {/* <Route
            path="/menu"
            element={
              <CardProvider>
                <Menu></Menu>
              </CardProvider>
            }
          ></Route> */}
          {/* <Route
            path="/product/{product-name}"
            element={
              <CardProvider>
                <Product></Product>
              </CardProvider>
            }
          ></Route> */}
          {/* <Route path="signUp" element={<SignUp></SignUp>}></Route>
          <Route path="signIn" element={<SignIn></SignIn>}></Route> */}
        </Route>
      </Routes>
    </div>
  );
}

export default App;
