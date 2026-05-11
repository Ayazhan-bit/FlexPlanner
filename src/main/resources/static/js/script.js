function openModal() { document.getElementById('modal').style.display = 'flex'; }
  function nextStep(n) {
      document.querySelectorAll('.step').forEach(s => s.classList.remove('active'));
      document.getElementById('step' + n).classList.add('active');
  }