import React from "react";
import { useState } from "react";
import { useForm } from "react-hook-form";
import { NavLink } from "react-router-dom";
import styled from "styled-components";
import Button from "../../common/button/Button";
import Checkbox from "../../common/checkbox/Checkbox";
import FormGroup from "../../common/FormGroup";


const Login = styled.div`
  background-image: url("https://toquoc.mediacdn.vn/280518851207290880/2022/11/8/31179150917295875507364757756846497121210070n-166787760377626129087.jpg");
  width: 100%;
  height: 100vh;
  background-repeat: no-repeat;
  background-size: cover;
  background-position: center;
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 0 100px;
`;

const SignIn = () => {
  const [check, setCheck] = useState(false);
  const [user, setUser] = useState({
    id: "",
    firstName: "",
    lastName: "",
    email: "",
    password: "",
  });
  const handleChangeUser = (e) => {
    const value = e.target.value;
    setUser({ ...user, [e.target.name]: value });
  };
  const {
    handleSubmit,
    formState: { errors },
    control,
  } = useForm();
  const onSubmitHandler = (values) => {
    console.log(values);
  };
  return (
    <Login>
      <div className="flex flex-col justify-center items-start m-10 gap-5 w-[40%] h-[80%] rounded-lg bg-slate-700 bg-opacity-60 p-10">
        <h1 className="text-[40px] font-bold">
          Sign in to The coffee<span className="text-blue-600">.</span>
        </h1>

        <div className="flex items-center justify-center w-full gap-5">
          <div className="py-2 px-3 bg-red-500 font-bold tracking-widest w-[110px] text-center text-white rounded-[4px]">
            Google
          </div>
          <div className="py-2 px-3 bg-blue-600 font-bold tracking-widest w-[110px] text-center text-white rounded-[4px]">
            Facebook
          </div>
        </div>
        <div className="flex items-center justify-center w-full">
          <div className="w-[400px] h-[2px] bg-slate-400"></div>
        </div>
        <form
          action=""
          className="flex flex-col items-start justify-center w-full gap-5"
        >
          <FormGroup
            control={control}
            handleChangeUser={handleChangeUser}
            value={user.username}
            name="username"
          >
            Username
          </FormGroup>
          <FormGroup
            control={control}
            handleChangeUser={handleChangeUser}
            value={user.password}
            name="password"
            type="password"
          >
            Password
          </FormGroup>
          <Checkbox check={check} setCheck={setCheck}></Checkbox>
          <small className="text-[12px] tracking-widest ml-3">
            Do you have an new account?{" "}
            <NavLink to="signUp" className="text-blue-400">
              Sign Up
            </NavLink>
          </small>
          <div className="flex w-full gap-2">
            <Button className="px-5 py-3 text-base transition-all bg-blue-500 rounded-full hover:bg-blue-600">
              Log In
            </Button>
          </div>
        </form>
      </div>
      <div></div>
    </Login>
  );
};

export default SignIn;
