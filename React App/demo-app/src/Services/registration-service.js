import { myAxios } from "./helper";
export const signUp = (user) => {
    return myAxios.post("/api/Registrations", user).then((response) => response.data)

}
export const signIn=(user)=>{
    return myAxios.post("/lapi/login",user).then((response)=>response)
}

export const checkEmail=email=>{

    return myAxios.post(`/api/Registration/${email}`).then((response)=>response)
}